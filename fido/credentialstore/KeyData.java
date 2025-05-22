package com.google.android.gms.fido.credentialstore;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bdrq;
import defpackage.bdrs;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class KeyData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdrq();
    public final bdrs a;
    public final boolean b;
    public final byte[] c;
    public final PublicKey d;
    public final PrivateKey e;
    public final String f;
    public final byte[] g;
    public final byte[] h;
    public final Account i;
    public final boolean j;
    public final KeyMetadata k;
    public final boolean l;
    public final byte[] m;
    public final byte[] n;
    public final long o;
    public final boolean p;

    public KeyData(int i, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, String str, byte[] bArr4, byte[] bArr5, Account account, boolean z2, KeyMetadata keyMetadata, boolean z3, byte[] bArr6, byte[] bArr7, long j, boolean z4) {
        Throwable th;
        PublicKey publicKey;
        this.a = bdrs.a(i);
        this.b = z;
        this.c = bArr;
        this.f = str;
        this.g = bArr4;
        this.h = bArr5;
        this.i = account;
        this.j = z2;
        this.k = keyMetadata;
        this.l = z3;
        this.m = bArr6;
        this.n = bArr7;
        this.o = j;
        this.p = z4;
        PrivateKey privateKey = null;
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            publicKey = bArr2 != null ? keyFactory.generatePublic(new X509EncodedKeySpec(bArr2)) : null;
            if (bArr3 != null) {
                try {
                    privateKey = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr3));
                } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                    th = e;
                    Log.e("KeyData", "unable to decode key pair", th);
                    this.d = publicKey;
                    this.e = privateKey;
                }
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
            th = e2;
            publicKey = null;
        }
        this.d = publicKey;
        this.e = privateKey;
    }

    public static KeyData a(int i, byte[] bArr, Account account, boolean z, KeyMetadata keyMetadata) {
        atzb.c(bArr != null, "Parameters should not be empty.");
        return new KeyData(i, true, bArr, null, null, null, null, null, account, false, keyMetadata, false, null, null, -11644473600000L, z);
    }

    public static KeyData b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, KeyMetadata keyMetadata, Account account, boolean z, long j) {
        atzb.c((bArr == null || account == null) ? false : true, "Parameters cannot be null");
        atzb.b((bArr3 == null) != (bArr4 == null));
        return new KeyData(bdrs.SYNCED.f, false, bArr, bArr2, null, null, null, null, account, true, keyMetadata, z, bArr3, bArr4, j, false);
    }

    public static KeyData c(int i, byte[] bArr, String str, byte[] bArr2, byte[] bArr3, boolean z) {
        boolean z2 = false;
        if (bArr != null && str != null) {
            z2 = true;
        }
        atzb.c(z2, "Parameters should not be empty.");
        atzb.c(true, "Parameter should be false.");
        return new KeyData(i, false, bArr, null, null, str, bArr2, bArr3, null, false, null, z, null, null, -11644473600000L, false);
    }

    public static KeyData d(byte[] bArr, KeyPair keyPair, String str, byte[] bArr2, byte[] bArr3, boolean z) {
        boolean z2 = false;
        if (bArr != null && keyPair != null) {
            z2 = true;
        }
        atzb.c(z2, "Parameters should not be empty.");
        atzb.c(true, "Parameter should be false.");
        return new KeyData(bdrs.SOFTWARE.f, false, bArr, keyPair.getPublic().getEncoded(), keyPair.getPrivate().getEncoded(), str, bArr2, bArr3, null, false, null, z, null, null, -11644473600000L, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a.f);
        atzr.e(parcel, 2, this.b);
        atzr.i(parcel, 3, this.c, false);
        PublicKey publicKey = this.d;
        atzr.i(parcel, 4, publicKey == null ? null : publicKey.getEncoded(), false);
        PrivateKey privateKey = this.e;
        atzr.i(parcel, 5, privateKey != null ? privateKey.getEncoded() : null, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.i(parcel, 7, this.g, false);
        atzr.i(parcel, 8, this.h, false);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.e(parcel, 10, this.j);
        atzr.t(parcel, 11, this.k, i, false);
        atzr.e(parcel, 12, this.l);
        atzr.i(parcel, 13, this.m, false);
        atzr.i(parcel, 14, this.n, false);
        atzr.q(parcel, 15, this.o);
        atzr.e(parcel, 16, this.p);
        atzr.c(parcel, a);
    }
}
