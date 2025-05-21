package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.NoSuchPaddingException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class OpenSSLEvpCipherDESEDE extends OpenSSLEvpCipher {
    private static final int DES_BLOCK_SIZE = 8;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.org.conscrypt.OpenSSLEvpCipherDESEDE$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLCipher$Padding;

        static {
            int[] iArr = new int[OpenSSLCipher.Padding.values().length];
            $SwitchMap$org$conscrypt$OpenSSLCipher$Padding = iArr;
            try {
                iArr[OpenSSLCipher.Padding.NOPADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$conscrypt$OpenSSLCipher$Padding[OpenSSLCipher.Padding.PKCS5PADDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class CBC extends OpenSSLEvpCipherDESEDE {

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class NoPadding extends CBC {
            public NoPadding() {
                super(OpenSSLCipher.Padding.NOPADDING);
            }
        }

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class PKCS5Padding extends CBC {
            public PKCS5Padding() {
                super(OpenSSLCipher.Padding.PKCS5PADDING);
            }
        }

        public CBC(OpenSSLCipher.Padding padding) {
            super(OpenSSLCipher.Mode.CBC, padding);
        }
    }

    public OpenSSLEvpCipherDESEDE(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        super(mode, padding);
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i) {
        if (i != 16 && i != 24) {
            throw new InvalidKeyException("key size must be 128 or 192 bits");
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) {
        if (mode != OpenSSLCipher.Mode.CBC) {
            throw new NoSuchAlgorithmException("Unsupported mode ".concat(String.valueOf(mode.toString())));
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedPadding(OpenSSLCipher.Padding padding) {
        OpenSSLCipher.Padding padding2 = OpenSSLCipher.Padding.NOPADDING;
        int ordinal = padding.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            throw new NoSuchPaddingException("Unsupported padding ".concat(String.valueOf(padding.toString())));
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "DESede";
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 8;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLEvpCipher
    public String getCipherName(int i, OpenSSLCipher.Mode mode) {
        String lowerCase = mode.toString().toLowerCase(Locale.US);
        StringBuilder sb = new StringBuilder();
        sb.append(i == 16 ? "des-ede" : "des-ede3");
        sb.append("-");
        sb.append(lowerCase);
        return sb.toString();
    }
}
