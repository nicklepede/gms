package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import defpackage.a;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.NoSuchPaddingException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class OpenSSLEvpCipherAES extends OpenSSLEvpCipher {
    private static final int AES_BLOCK_SIZE = 16;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.org.conscrypt.OpenSSLEvpCipherAES$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLCipher$Mode;
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
            int[] iArr2 = new int[OpenSSLCipher.Mode.values().length];
            $SwitchMap$org$conscrypt$OpenSSLCipher$Mode = iArr2;
            try {
                iArr2[OpenSSLCipher.Mode.CBC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$conscrypt$OpenSSLCipher$Mode[OpenSSLCipher.Mode.CTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$conscrypt$OpenSSLCipher$Mode[OpenSSLCipher.Mode.ECB.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class AES extends OpenSSLEvpCipherAES {

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class CBC extends AES {

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

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class CTR extends AES {
            public CTR() {
                super(OpenSSLCipher.Mode.CTR, OpenSSLCipher.Padding.NOPADDING);
            }
        }

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class ECB extends AES {

            /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
            public class NoPadding extends ECB {
                public NoPadding() {
                    super(OpenSSLCipher.Padding.NOPADDING);
                }
            }

            /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
            public class PKCS5Padding extends ECB {
                public PKCS5Padding() {
                    super(OpenSSLCipher.Padding.PKCS5PADDING);
                }
            }

            public ECB(OpenSSLCipher.Padding padding) {
                super(OpenSSLCipher.Mode.ECB, padding);
            }
        }

        public AES(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
            super(mode, padding);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
        public void checkSupportedKeySize(int i) {
            if (i != 16 && i != 24 && i != 32) {
                throw new InvalidKeyException(a.l(i, "Unsupported key size: ", " bytes"));
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class AES_128 extends OpenSSLEvpCipherAES {

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class CBC extends AES_128 {

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

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class CTR extends AES_128 {
            public CTR() {
                super(OpenSSLCipher.Mode.CTR, OpenSSLCipher.Padding.NOPADDING);
            }
        }

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class ECB extends AES_128 {

            /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
            public class NoPadding extends ECB {
                public NoPadding() {
                    super(OpenSSLCipher.Padding.NOPADDING);
                }
            }

            /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
            public class PKCS5Padding extends ECB {
                public PKCS5Padding() {
                    super(OpenSSLCipher.Padding.PKCS5PADDING);
                }
            }

            public ECB(OpenSSLCipher.Padding padding) {
                super(OpenSSLCipher.Mode.ECB, padding);
            }
        }

        public AES_128(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
            super(mode, padding);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
        public void checkSupportedKeySize(int i) {
            if (i != 16) {
                throw new InvalidKeyException(a.l(i, "Unsupported key size: ", " bytes"));
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class AES_256 extends OpenSSLEvpCipherAES {

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class CBC extends AES_256 {

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

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class CTR extends AES_256 {
            public CTR() {
                super(OpenSSLCipher.Mode.CTR, OpenSSLCipher.Padding.NOPADDING);
            }
        }

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class ECB extends AES_256 {

            /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
            public class NoPadding extends ECB {
                public NoPadding() {
                    super(OpenSSLCipher.Padding.NOPADDING);
                }
            }

            /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
            public class PKCS5Padding extends ECB {
                public PKCS5Padding() {
                    super(OpenSSLCipher.Padding.PKCS5PADDING);
                }
            }

            public ECB(OpenSSLCipher.Padding padding) {
                super(OpenSSLCipher.Mode.ECB, padding);
            }
        }

        public AES_256(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
            super(mode, padding);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
        public void checkSupportedKeySize(int i) {
            if (i != 32) {
                throw new InvalidKeyException(a.l(i, "Unsupported key size: ", " bytes"));
            }
        }
    }

    public OpenSSLEvpCipherAES(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        super(mode, padding);
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) {
        OpenSSLCipher.Padding padding = OpenSSLCipher.Padding.NOPADDING;
        OpenSSLCipher.Mode mode2 = OpenSSLCipher.Mode.NONE;
        int ordinal = mode.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            throw new NoSuchAlgorithmException("Unsupported mode ".concat(String.valueOf(mode.toString())));
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedPadding(OpenSSLCipher.Padding padding) {
        OpenSSLCipher.Padding padding2 = OpenSSLCipher.Padding.NOPADDING;
        OpenSSLCipher.Mode mode = OpenSSLCipher.Mode.NONE;
        int ordinal = padding.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            throw new NoSuchPaddingException("Unsupported padding ".concat(String.valueOf(padding.toString())));
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "AES";
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 16;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLEvpCipher
    public String getCipherName(int i, OpenSSLCipher.Mode mode) {
        return "aes-" + (i * 8) + "-" + mode.toString().toLowerCase(Locale.US);
    }
}
