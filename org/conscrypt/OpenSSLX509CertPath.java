package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.security.cert.CertPath;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
final class OpenSSLX509CertPath extends CertPath {
    private static final int PUSHBACK_SIZE = 64;
    private static final long serialVersionUID = -3249106005255170761L;
    private final List mCertificates;
    private static final byte[] PKCS7_MARKER = {45, 45, 45, 45, 45, 66, 69, 71, 73, 78, 32, 80, 75, 67, 83, 55};
    private static final List ALL_ENCODINGS = DesugarCollections.unmodifiableList(Arrays.asList(Encoding.PKI_PATH.apiName, Encoding.PKCS7.apiName));
    private static final Encoding DEFAULT_ENCODING = Encoding.PKI_PATH;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    enum Encoding {
        PKI_PATH("PkiPath"),
        PKCS7("PKCS7");

        private final String apiName;

        Encoding(String str) {
            this.apiName = str;
        }

        static Encoding findByApiName(String str) {
            for (Encoding encoding : values()) {
                if (encoding.apiName.equals(str)) {
                    return encoding;
                }
            }
            return null;
        }
    }

    public OpenSSLX509CertPath(List list) {
        super("X.509");
        this.mCertificates = list;
    }

    static CertPath fromEncoding(InputStream inputStream) {
        if (inputStream != null) {
            return fromEncoding(inputStream, DEFAULT_ENCODING);
        }
        throw new CertificateException("inStream == null");
    }

    private static CertPath fromPkcs7Encoding(InputStream inputStream) {
        if (inputStream != null) {
            try {
                if (inputStream.available() != 0) {
                    boolean markSupported = inputStream.markSupported();
                    if (markSupported) {
                        inputStream.mark(64);
                    }
                    PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 64);
                    try {
                        byte[] bArr = PKCS7_MARKER;
                        byte[] bArr2 = new byte[bArr.length];
                        int read = pushbackInputStream.read(bArr2);
                        if (read < 0) {
                            throw new OpenSSLX509CertificateFactory.ParsingException("inStream is empty");
                        }
                        pushbackInputStream.unread(bArr2, 0, read);
                        return (read == bArr.length && Arrays.equals(bArr, bArr2)) ? new OpenSSLX509CertPath(OpenSSLX509Certificate.fromPkcs7PemInputStream(pushbackInputStream)) : new OpenSSLX509CertPath(OpenSSLX509Certificate.fromPkcs7DerInputStream(pushbackInputStream));
                    } catch (Exception e) {
                        if (markSupported) {
                            try {
                                inputStream.reset();
                            } catch (IOException unused) {
                            }
                        }
                        throw new CertificateException(e);
                    }
                }
            } catch (IOException e2) {
                throw new CertificateException("Problem reading input stream", e2);
            }
        }
        return new OpenSSLX509CertPath(Collections.EMPTY_LIST);
    }

    private static CertPath fromPkiPathEncoding(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        boolean markSupported = inputStream.markSupported();
        if (markSupported) {
            inputStream.mark(64);
        }
        try {
            try {
                long[] ASN1_seq_unpack_X509_bio = NativeCrypto.ASN1_seq_unpack_X509_bio(openSSLBIOInputStream.getBioContext());
                if (ASN1_seq_unpack_X509_bio == null) {
                    return new OpenSSLX509CertPath(Collections.EMPTY_LIST);
                }
                int length = ASN1_seq_unpack_X509_bio.length;
                ArrayList arrayList = new ArrayList(length);
                while (true) {
                    length--;
                    if (length < 0) {
                        return new OpenSSLX509CertPath(arrayList);
                    }
                    long j = ASN1_seq_unpack_X509_bio[length];
                    if (j != 0) {
                        try {
                            arrayList.add(new OpenSSLX509Certificate(j));
                        } catch (OpenSSLX509CertificateFactory.ParsingException e) {
                            throw new CertificateParsingException(e);
                        }
                    }
                }
            } finally {
                openSSLBIOInputStream.release();
            }
        } catch (Exception e2) {
            if (markSupported) {
                try {
                    inputStream.reset();
                } catch (IOException unused) {
                }
            }
            throw new CertificateException(e2);
        }
    }

    static Iterator getEncodingsIterator() {
        return ALL_ENCODINGS.iterator();
    }

    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return DesugarCollections.unmodifiableList(this.mCertificates);
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() {
        return getEncoded(DEFAULT_ENCODING);
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return getEncodingsIterator();
    }

    private byte[] getEncoded(Encoding encoding) {
        OpenSSLX509Certificate fromX509Der;
        int size = this.mCertificates.size();
        OpenSSLX509Certificate[] openSSLX509CertificateArr = new OpenSSLX509Certificate[size];
        long[] jArr = new long[size];
        int i = 0;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            X509Certificate x509Certificate = (X509Certificate) this.mCertificates.get(i);
            if (x509Certificate instanceof OpenSSLX509Certificate) {
                fromX509Der = (OpenSSLX509Certificate) x509Certificate;
                openSSLX509CertificateArr[i2] = fromX509Der;
            } else {
                fromX509Der = OpenSSLX509Certificate.fromX509Der(x509Certificate.getEncoded());
                openSSLX509CertificateArr[i2] = fromX509Der;
            }
            jArr[i2] = fromX509Der.getContext();
            i++;
        }
        int ordinal = encoding.ordinal();
        if (ordinal == 0) {
            return NativeCrypto.ASN1_seq_pack_X509(jArr);
        }
        if (ordinal == 1) {
            return NativeCrypto.i2d_PKCS7(jArr);
        }
        throw new CertificateEncodingException("Unknown encoding");
    }

    private static CertPath fromEncoding(InputStream inputStream, Encoding encoding) {
        int ordinal = encoding.ordinal();
        if (ordinal == 0) {
            return fromPkiPathEncoding(inputStream);
        }
        if (ordinal == 1) {
            return fromPkcs7Encoding(inputStream);
        }
        throw new CertificateEncodingException("Unknown encoding");
    }

    static CertPath fromEncoding(InputStream inputStream, String str) {
        if (inputStream != null) {
            Encoding findByApiName = Encoding.findByApiName(str);
            if (findByApiName != null) {
                return fromEncoding(inputStream, findByApiName);
            }
            throw new CertificateException("Invalid encoding: ".concat(String.valueOf(str)));
        }
        throw new CertificateException("inStream == null");
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) {
        Encoding findByApiName = Encoding.findByApiName(str);
        if (findByApiName != null) {
            return getEncoded(findByApiName);
        }
        throw new CertificateEncodingException("Invalid encoding: ".concat(String.valueOf(str)));
    }
}
