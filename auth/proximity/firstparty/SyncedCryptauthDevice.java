package com.google.android.gms.auth.proximity.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.acof;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.asnj;
import defpackage.eitj;
import defpackage.ejcb;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SyncedCryptauthDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acof();
    public final byte[] a;
    public final String b;
    public final String c;
    public final String d;
    final boolean e;
    public final boolean f;
    final long g;
    final boolean h;
    public final String i;
    final boolean j;
    final boolean k;
    public final List l;
    public final List m;
    final List n;
    public final AttestationVerifier o;

    public SyncedCryptauthDevice(byte[] bArr, String str, String str2, String str3, boolean z, boolean z2, long j, boolean z3, String str4, boolean z4, boolean z5, List list, List list2, List list3, AttestationVerifier attestationVerifier) {
        eitj i;
        arwm.s(bArr);
        this.a = bArr;
        arwm.q(str);
        this.b = str;
        this.c = str2 == null ? "" : str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = j;
        this.h = z3;
        this.i = str4;
        this.j = z4;
        this.k = z5;
        this.l = list;
        this.m = list2;
        if (list3 == null) {
            int i2 = eitj.d;
            i = ejcb.a;
        } else {
            i = eitj.i(list3);
        }
        this.n = i;
        this.o = attestationVerifier;
    }

    private static String b(List list) {
        return a.al(list, "[ ", ", ", " ]");
    }

    public final eitj a() {
        return eitj.i(this.n);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncedCryptauthDevice)) {
            return false;
        }
        SyncedCryptauthDevice syncedCryptauthDevice = (SyncedCryptauthDevice) obj;
        if (Arrays.equals(this.a, syncedCryptauthDevice.a) && TextUtils.equals(this.b, syncedCryptauthDevice.b) && TextUtils.equals(this.c, syncedCryptauthDevice.c) && this.f == syncedCryptauthDevice.f && this.e == syncedCryptauthDevice.e && this.h == syncedCryptauthDevice.h && TextUtils.equals(this.d, syncedCryptauthDevice.d) && TextUtils.equals(this.i, syncedCryptauthDevice.i) && this.j == syncedCryptauthDevice.j && this.k == syncedCryptauthDevice.k) {
            List list = this.m;
            List list2 = syncedCryptauthDevice.m;
            if (list.size() == list2.size() && list.containsAll(list2)) {
                List list3 = this.l;
                List list4 = syncedCryptauthDevice.l;
                if (list3.size() == list4.size() && this.n.equals(syncedCryptauthDevice.n) && list3.containsAll(list4) && arwb.b(this.o, syncedCryptauthDevice.o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.f), Boolean.valueOf(this.e), Boolean.valueOf(this.h), this.d, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k), this.l, this.m, this.n, this.o});
    }

    public final String toString() {
        return String.format("SyncedCryptauthDevice { mPublicKey='%s', mAccountId=%s, mName='%s', mIsUnlockable=%b, mIsUnlockKey=%b, mIsMobileHotspotSupported=%b, mBtMacAddress='%s', mDeviceType=%s, mIsPixelPhone=%s, isArcPlusPlus=%s, supportedFeatures=%s, enabledFeatures=%s}", asnj.b(this.a), this.b, this.c, Boolean.valueOf(this.f), Boolean.valueOf(this.e), Boolean.valueOf(this.h), this.d, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k), b(this.l), b(this.m));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.e(parcel, 5, this.e);
        arxc.e(parcel, 6, this.f);
        arxc.q(parcel, 7, this.g);
        arxc.e(parcel, 8, this.h);
        arxc.v(parcel, 9, this.i, false);
        arxc.e(parcel, 10, this.j);
        arxc.e(parcel, 11, this.k);
        arxc.x(parcel, 12, this.l, false);
        arxc.x(parcel, 13, this.m, false);
        arxc.y(parcel, 14, this.n, false);
        arxc.t(parcel, 15, this.o, i, false);
        arxc.c(parcel, a);
    }
}
