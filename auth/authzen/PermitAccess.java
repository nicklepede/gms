package com.google.android.gms.auth.authzen;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.authzen.gencode.server.api.BeaconSeedEntity;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.zsp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PermitAccess extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new zsp();
    final int a;
    public final String b;
    final String c;
    final byte[] d;
    final String e;
    final boolean f;
    final boolean g;
    final boolean h;
    final String i;
    final String j;
    final List k;
    final long l;
    final boolean m;
    final boolean n;

    public PermitAccess(int i, String str, String str2, byte[] bArr, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, List list, long j, boolean z4, boolean z5) {
        this.a = i;
        arwm.q(str);
        this.b = str;
        arwm.q(str2);
        this.c = str2;
        arwm.s(bArr);
        this.d = bArr;
        this.e = str3 == null ? "" : str3;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str4;
        this.j = str5;
        this.k = list == null ? new ArrayList() : list;
        this.l = j;
        this.m = z4;
        this.n = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PermitAccess)) {
            return false;
        }
        PermitAccess permitAccess = (PermitAccess) obj;
        if (TextUtils.equals(this.b, permitAccess.b) && TextUtils.equals(this.c, permitAccess.c) && Arrays.equals(this.d, permitAccess.d) && TextUtils.equals(this.e, permitAccess.e) && this.f == permitAccess.f && this.g == permitAccess.g && this.h == permitAccess.h && TextUtils.equals(this.i, permitAccess.i) && TextUtils.equals(this.j, permitAccess.j)) {
            List list = permitAccess.k;
            List list2 = this.k;
            if (list2.size() == list.size()) {
                int size = list2.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        if (this.m != permitAccess.m || this.n != permitAccess.n) {
                            break;
                        }
                        return true;
                    }
                    if (!((BeaconSeedEntity) list2.get(i)).equals((BeaconSeedEntity) list.get(i))) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, Boolean.valueOf(this.m), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        return String.format("PermitAccess{mVersion=%d, mId='%s', mType='%s', mName='%s', mIsUnlockable=%b, mIsUnlockKey=%b, mIsMobileHotspotSupported=%b, mBtMacAddress='%s', mDeviceType=%s, pixel=%s, arc=%s}", Integer.valueOf(this.a), this.b, this.c, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, Boolean.valueOf(this.m), Boolean.valueOf(this.n));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.i(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.e(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.e(parcel, 8, this.h);
        arxc.v(parcel, 9, this.i, false);
        arxc.v(parcel, 10, this.j, false);
        arxc.y(parcel, 11, this.k, false);
        arxc.q(parcel, 12, this.l);
        arxc.e(parcel, 13, this.m);
        arxc.e(parcel, 14, this.n);
        arxc.c(parcel, a);
    }
}
