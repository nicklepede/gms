package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import defpackage.a;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public abstract class OpenSSLAeadCipher extends OpenSSLCipher {
    static final int DEFAULT_TAG_SIZE_BITS = 128;
    private byte[] aad;
    private ExposedByteArrayOutputStream buf;
    int bufCount;
    long evpAead;
    private boolean mustInitialize;
    private byte[] previousIv;
    private byte[] previousKey;
    int tagLengthInBytes;

    protected OpenSSLAeadCipher(OpenSSLCipher.Mode mode) {
        super(mode, OpenSSLCipher.Padding.NOPADDING);
        this.buf = null;
    }

    private boolean arraysAreEqual(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            int i = 0;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                i |= bArr[i2] ^ bArr2[i2];
            }
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    private void checkInitialization() {
        if (this.mustInitialize) {
            throw new IllegalStateException("Cannot re-use same key and IV for multiple encryptions");
        }
    }

    private void reset() {
        this.aad = null;
        ExposedByteArrayOutputStream exposedByteArrayOutputStream = this.buf;
        if (exposedByteArrayOutputStream != null) {
            int length = exposedByteArrayOutputStream.array().length;
            if (length <= 1024 || this.bufCount >= (length >> 3)) {
                this.buf.reset();
            } else {
                this.buf = null;
            }
        }
        this.bufCount = 0;
    }

    private void throwAEADBadTagExceptionIfAvailable(String str, Throwable th) {
        try {
            BadPaddingException badPaddingException = null;
            try {
                try {
                    BadPaddingException badPaddingException2 = (BadPaddingException) Class.forName("javax.crypto.AEADBadTagException").getConstructor(String.class).newInstance(str);
                    try {
                        badPaddingException2.initCause(th);
                    } catch (IllegalAccessException | InstantiationException unused) {
                    }
                    badPaddingException = badPaddingException2;
                } catch (InvocationTargetException e) {
                    throw ((BadPaddingException) new BadPaddingException().initCause(e.getTargetException()));
                }
            } catch (IllegalAccessException | InstantiationException unused2) {
            }
            if (badPaddingException != null) {
                throw badPaddingException;
            }
        } catch (Exception unused3) {
        }
    }

    public boolean allowsNonceReuse() {
        return false;
    }

    public void appendToBuf(byte[] bArr, int i, int i2) {
        ArrayUtils.checkOffsetAndCount(bArr.length, i, i2);
        if (this.buf == null) {
            this.buf = new ExposedByteArrayOutputStream(i2);
        }
        this.buf.write(bArr, i, i2);
        this.bufCount += i2;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedPadding(OpenSSLCipher.Padding padding) {
        if (padding != OpenSSLCipher.Padding.NOPADDING) {
            throw new NoSuchPaddingException("Must be NoPadding for AEAD ciphers");
        }
    }

    public void checkSupportedTagLength(int i) {
        if (i % 8 != 0) {
            throw new InvalidAlgorithmParameterException(a.j(i, "Tag length must be a multiple of 8; was "));
        }
    }

    public int doFinalInternal(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        checkInitialization();
        try {
            int EVP_AEAD_CTX_seal_buf = isEncrypting() ? NativeCrypto.EVP_AEAD_CTX_seal_buf(this.evpAead, this.encodedKey, this.tagLengthInBytes, byteBuffer2, this.iv, byteBuffer, this.aad) : NativeCrypto.EVP_AEAD_CTX_open_buf(this.evpAead, this.encodedKey, this.tagLengthInBytes, byteBuffer2, this.iv, byteBuffer, this.aad);
            if (isEncrypting()) {
                this.mustInitialize = true;
            }
            return EVP_AEAD_CTX_seal_buf;
        } catch (BadPaddingException e) {
            throwAEADBadTagExceptionIfAvailable(e.getMessage(), e.getCause());
            throw e;
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (!Conscrypt.getEnableBytebufferOptimizations()) {
            return super.engineDoFinal(byteBuffer, byteBuffer2);
        }
        if (byteBuffer == null || byteBuffer2 == null) {
            throw new NullPointerException("Null ByteBuffer Error");
        }
        if (getOutputSizeForFinal(byteBuffer.remaining()) > byteBuffer2.remaining()) {
            throw new ShortBufferWithoutStackTraceException("Insufficient Bytes for Output Buffer");
        }
        if (byteBuffer2.isReadOnly()) {
            throw new IllegalArgumentException("Cannot write to Read Only ByteBuffer");
        }
        if (this.bufCount != 0) {
            return super.engineDoFinal(byteBuffer, byteBuffer2);
        }
        if (!byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            allocateDirect.mark();
            allocateDirect.put(byteBuffer);
            allocateDirect.reset();
            byteBuffer = allocateDirect;
        }
        if (byteBuffer2.isDirect()) {
            int doFinalInternal = doFinalInternal(byteBuffer, byteBuffer2);
            byteBuffer2.position(byteBuffer2.position() + doFinalInternal);
            byteBuffer.position(byteBuffer.limit());
            return doFinalInternal;
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(getOutputSizeForFinal(byteBuffer.remaining()));
        int doFinalInternal2 = doFinalInternal(byteBuffer, allocateDirect2);
        byteBuffer2.put(allocateDirect2);
        byteBuffer.position(byteBuffer.limit());
        return doFinalInternal2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void engineInitInternal(byte[] r5, java.security.spec.AlgorithmParameterSpec r6, java.security.SecureRandom r7) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.OpenSSLAeadCipher.engineInitInternal(byte[], java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(ByteBuffer byteBuffer) {
        checkInitialization();
        byte[] bArr = this.aad;
        if (bArr == null) {
            byte[] bArr2 = new byte[byteBuffer.remaining()];
            this.aad = bArr2;
            byteBuffer.get(bArr2);
        } else {
            byte[] bArr3 = new byte[bArr.length + byteBuffer.remaining()];
            byte[] bArr4 = this.aad;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            byteBuffer.get(bArr3, this.aad.length, byteBuffer.remaining());
            this.aad = bArr3;
        }
    }

    public abstract long getEVP_AEAD(int i);

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getOutputSizeForUpdate(int i) {
        return 0;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int updateInternal(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        checkInitialization();
        appendToBuf(bArr, i, i2);
        return 0;
    }

    protected OpenSSLAeadCipher(OpenSSLCipher.Mode mode, int i, int i2, int i3) {
        super(mode, OpenSSLCipher.Padding.NOPADDING, i, i2, i3);
        this.buf = null;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] bArr, int i, int i2) {
        checkInitialization();
        byte[] bArr2 = this.aad;
        if (bArr2 == null) {
            this.aad = Arrays.copyOfRange(bArr, i, i2 + i);
            return;
        }
        int length = bArr2.length;
        byte[] bArr3 = new byte[length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        System.arraycopy(bArr, i, bArr3, this.aad.length, i2);
        this.aad = bArr3;
    }

    public int doFinalInternal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3;
        int i4;
        int i5;
        int EVP_AEAD_CTX_open;
        checkInitialization();
        if (this.bufCount > 0) {
            if (i2 > 0) {
                appendToBuf(bArr, i, i2);
            }
            bArr3 = this.buf.array();
            i5 = this.bufCount;
            i4 = 0;
        } else if (i2 == 0) {
            if (bArr == null) {
                bArr = EmptyArray.BYTE;
            }
            bArr3 = bArr;
            i4 = i;
            i5 = 0;
        } else {
            bArr3 = bArr;
            i4 = i;
            i5 = i2;
        }
        try {
            if (isEncrypting()) {
                EVP_AEAD_CTX_open = NativeCrypto.EVP_AEAD_CTX_seal(this.evpAead, this.encodedKey, this.tagLengthInBytes, bArr2, i3, this.iv, bArr3, i4, i5, this.aad);
            } else {
                EVP_AEAD_CTX_open = NativeCrypto.EVP_AEAD_CTX_open(this.evpAead, this.encodedKey, this.tagLengthInBytes, bArr2, i3, this.iv, bArr3, i4, i5, this.aad);
            }
            if (isEncrypting()) {
                this.mustInitialize = true;
            }
            reset();
            return EVP_AEAD_CTX_open;
        } catch (BadPaddingException e) {
            throwAEADBadTagExceptionIfAvailable(e.getMessage(), e.getCause());
            throw e;
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        int outputSizeForFinal = getOutputSizeForFinal(i2);
        byte[] bArr2 = new byte[outputSizeForFinal];
        try {
            int doFinalInternal = doFinalInternal(bArr, i, i2, bArr2, 0);
            return doFinalInternal == outputSizeForFinal ? bArr2 : doFinalInternal == 0 ? EmptyArray.BYTE : Arrays.copyOf(bArr2, doFinalInternal);
        } catch (ShortBufferException e) {
            throw new RuntimeException("our calculated buffer was too small", e);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr2 != null) {
            if (getOutputSizeForFinal(i2) <= bArr2.length - i3) {
                return doFinalInternal(bArr, i, i2, bArr2, i3);
            }
            throw new ShortBufferWithoutStackTraceException("Insufficient output space");
        }
        throw new NullPointerException("output == null");
    }
}
