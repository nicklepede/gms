package com.google.android.gms.org.conscrypt;

import defpackage.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OpenSSLX509CertificateFactory extends CertificateFactorySpi {
    private static final byte[] PKCS7_MARKER = {45, 45, 45, 45, 45, 66, 69, 71, 73, 78, 32, 80, 75, 67, 83, 55};
    private static final int PUSHBACK_SIZE = 64;
    private Parser certificateParser = new Parser(this) { // from class: com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory.1
        @Override // com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public List fromPkcs7DerInputStream(InputStream inputStream) {
            return OpenSSLX509Certificate.fromPkcs7DerInputStream(inputStream);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public List fromPkcs7PemInputStream(InputStream inputStream) {
            return OpenSSLX509Certificate.fromPkcs7PemInputStream(inputStream);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public OpenSSLX509Certificate fromX509DerInputStream(InputStream inputStream) {
            return OpenSSLX509Certificate.fromX509DerInputStream(inputStream);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public OpenSSLX509Certificate fromX509PemInputStream(InputStream inputStream) {
            return OpenSSLX509Certificate.fromX509PemInputStream(inputStream);
        }
    };
    private Parser crlParser = new Parser(this) { // from class: com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory.2
        @Override // com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public List fromPkcs7DerInputStream(InputStream inputStream) {
            return OpenSSLX509CRL.fromPkcs7DerInputStream(inputStream);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public List fromPkcs7PemInputStream(InputStream inputStream) {
            return OpenSSLX509CRL.fromPkcs7PemInputStream(inputStream);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public OpenSSLX509CRL fromX509DerInputStream(InputStream inputStream) {
            return OpenSSLX509CRL.fromX509DerInputStream(inputStream);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public OpenSSLX509CRL fromX509PemInputStream(InputStream inputStream) {
            return OpenSSLX509CRL.fromX509PemInputStream(inputStream);
        }
    };

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    abstract class Parser {
        private Parser() {
        }

        protected abstract List fromPkcs7DerInputStream(InputStream inputStream);

        protected abstract List fromPkcs7PemInputStream(InputStream inputStream);

        protected abstract Object fromX509DerInputStream(InputStream inputStream);

        protected abstract Object fromX509PemInputStream(InputStream inputStream);

        public Object generateItem(InputStream inputStream) {
            if (inputStream == null) {
                throw new ParsingException("inStream == null");
            }
            boolean markSupported = inputStream.markSupported();
            if (markSupported) {
                inputStream.mark(OpenSSLX509CertificateFactory.PKCS7_MARKER.length);
            }
            PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 64);
            try {
                byte[] bArr = new byte[OpenSSLX509CertificateFactory.PKCS7_MARKER.length];
                int read = pushbackInputStream.read(bArr);
                if (read < 0) {
                    throw new ParsingException("inStream is empty");
                }
                pushbackInputStream.unread(bArr, 0, read);
                if (bArr[0] == 45) {
                    return fromX509PemInputStream(pushbackInputStream);
                }
                if (!OpenSSLX509CertificateFactory.isMaybePkcs7(bArr)) {
                    return fromX509DerInputStream(pushbackInputStream);
                }
                List fromPkcs7DerInputStream = fromPkcs7DerInputStream(pushbackInputStream);
                if (fromPkcs7DerInputStream.size() == 0) {
                    return null;
                }
                return fromPkcs7DerInputStream.get(0);
            } catch (Exception e) {
                if (markSupported) {
                    try {
                        inputStream.reset();
                    } catch (IOException unused) {
                    }
                }
                throw new ParsingException(e);
            }
        }

        public Collection generateItems(InputStream inputStream) {
            Object obj;
            if (inputStream == null) {
                throw new ParsingException("inStream == null");
            }
            boolean markSupported = inputStream.markSupported();
            if (markSupported) {
                inputStream.mark(64);
            }
            PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 64);
            try {
                byte[] bArr = new byte[OpenSSLX509CertificateFactory.PKCS7_MARKER.length];
                int read = pushbackInputStream.read(bArr);
                if (read < 0) {
                    return new ArrayList();
                }
                pushbackInputStream.unread(bArr, 0, read);
                if (read == OpenSSLX509CertificateFactory.PKCS7_MARKER.length && Arrays.equals(OpenSSLX509CertificateFactory.PKCS7_MARKER, bArr)) {
                    return fromPkcs7PemInputStream(pushbackInputStream);
                }
                if (OpenSSLX509CertificateFactory.isMaybePkcs7(bArr)) {
                    return fromPkcs7DerInputStream(pushbackInputStream);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    if (markSupported) {
                        inputStream.mark(64);
                    }
                    try {
                        obj = generateItem(pushbackInputStream);
                        arrayList.add(obj);
                    } catch (ParsingException unused) {
                        obj = null;
                        if (markSupported) {
                            try {
                                inputStream.reset();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                } while (obj != null);
                return arrayList;
            } catch (Exception e) {
                if (markSupported) {
                    try {
                        inputStream.reset();
                    } catch (IOException unused3) {
                    }
                }
                throw new ParsingException(e);
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class ParsingException extends Exception {
        private static final long serialVersionUID = 8390802697728301325L;

        public ParsingException(Exception exc) {
            super(exc);
        }

        public ParsingException(String str) {
            super(str);
        }

        ParsingException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMaybePkcs7(byte[] bArr) {
        int length = bArr.length;
        int i = 2;
        if (length >= 2 && bArr[0] == 48) {
            int i2 = bArr[1] & 255;
            if (i2 > 128) {
                if (i2 == 129) {
                    i = 3;
                } else if (i2 == 130) {
                    i = 4;
                } else if (i2 == 131) {
                    i = 5;
                } else if (i2 == 132) {
                    i = 6;
                }
            }
            if (i < length && bArr[i] == 6) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) {
        try {
            return (CRL) this.crlParser.generateItem(inputStream);
        } catch (ParsingException e) {
            throw new CRLException(e);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCRLs(InputStream inputStream) {
        if (inputStream == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            return this.crlParser.generateItems(inputStream);
        } catch (ParsingException e) {
            throw new CRLException(e);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) {
        return OpenSSLX509CertPath.fromEncoding(inputStream);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) {
        try {
            return (Certificate) this.certificateParser.generateItem(inputStream);
        } catch (ParsingException e) {
            throw new CertificateException(e);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCertificates(InputStream inputStream) {
        try {
            return this.certificateParser.generateItems(inputStream);
        } catch (ParsingException e) {
            throw new CertificateException(e);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Iterator engineGetCertPathEncodings() {
        return OpenSSLX509CertPath.getEncodingsIterator();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return OpenSSLX509CertPath.fromEncoding(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            Certificate certificate = (Certificate) list.get(i);
            if (certificate instanceof X509Certificate) {
                arrayList.add((X509Certificate) certificate);
            } else {
                throw new CertificateException(a.j(i, "Certificate not X.509 type at index "));
            }
        }
        return new OpenSSLX509CertPath(arrayList);
    }
}
