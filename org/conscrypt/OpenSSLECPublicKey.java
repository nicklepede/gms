package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.InvalidKeyException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
final class OpenSSLECPublicKey implements ECPublicKey, OpenSSLKeyHolder {
    private static final String ALGORITHM = "EC";
    private static final long serialVersionUID = 3215842926808298020L;
    private transient OpenSSLECGroupContext group;
    private transient OpenSSLKey key;

    public OpenSSLECPublicKey(OpenSSLECGroupContext openSSLECGroupContext, OpenSSLKey openSSLKey) {
        this.group = openSSLECGroupContext;
        this.key = openSSLKey;
    }

    static OpenSSLKey getInstance(ECPublicKey eCPublicKey) {
        try {
            OpenSSLECGroupContext openSSLECGroupContext = OpenSSLECGroupContext.getInstance(eCPublicKey.getParams());
            return new OpenSSLKey(NativeCrypto.EVP_PKEY_new_EC_KEY(openSSLECGroupContext.getNativeRef(), OpenSSLECPointContext.getInstance(openSSLECGroupContext, eCPublicKey.getW()).getNativeRef(), null));
        } catch (Exception e) {
            throw new InvalidKeyException(e);
        }
    }

    private ECPoint getPublicKey() {
        return new OpenSSLECPointContext(this.group, new NativeRef.EC_POINT(NativeCrypto.EC_KEY_get_public_key(this.key.getNativeRef()))).getECPoint();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.key = new OpenSSLKey(NativeCrypto.EVP_parse_public_key((byte[]) objectInputStream.readObject()));
            this.group = new OpenSSLECGroupContext(new NativeRef.EC_GROUP(NativeCrypto.EC_KEY_get1_group(this.key.getNativeRef())));
        } catch (OpenSSLX509CertificateFactory.ParsingException e) {
            throw new IOException(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        if (this.key.isHardwareBacked()) {
            throw new NotSerializableException("Hardware backed keys cannot be serialized");
        }
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpenSSLECPublicKey) {
            return this.key.equals(((OpenSSLECPublicKey) obj).key);
        }
        if (!(obj instanceof ECPublicKey)) {
            return false;
        }
        ECPublicKey eCPublicKey = (ECPublicKey) obj;
        if (!getPublicKey().equals(eCPublicKey.getW())) {
            return false;
        }
        ECParameterSpec params = getParams();
        ECParameterSpec params2 = eCPublicKey.getParams();
        return params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return ALGORITHM;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return NativeCrypto.EVP_marshal_public_key(this.key.getNativeRef());
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLKeyHolder
    public OpenSSLKey getOpenSSLKey() {
        return this.key;
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.group.getECParameterSpec();
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return getPublicKey();
    }

    public int hashCode() {
        return Arrays.hashCode(NativeCrypto.EVP_marshal_public_key(this.key.getNativeRef()));
    }

    public String toString() {
        return NativeCrypto.EVP_PKEY_print_public(this.key.getNativeRef());
    }

    public OpenSSLECPublicKey(OpenSSLKey openSSLKey) {
        this.group = new OpenSSLECGroupContext(new NativeRef.EC_GROUP(NativeCrypto.EC_KEY_get1_group(openSSLKey.getNativeRef())));
        this.key = openSSLKey;
    }

    public OpenSSLECPublicKey(ECPublicKeySpec eCPublicKeySpec) {
        try {
            OpenSSLECGroupContext openSSLECGroupContext = OpenSSLECGroupContext.getInstance(eCPublicKeySpec.getParams());
            this.group = openSSLECGroupContext;
            this.key = new OpenSSLKey(NativeCrypto.EVP_PKEY_new_EC_KEY(this.group.getNativeRef(), OpenSSLECPointContext.getInstance(openSSLECGroupContext, eCPublicKeySpec.getW()).getNativeRef(), null));
        } catch (Exception e) {
            throw new InvalidKeySpecException(e);
        }
    }
}
