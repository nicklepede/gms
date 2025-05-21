package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aban;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FACLConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aban();
    final int a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public FACLConfig(int i, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FACLConfig) {
            FACLConfig fACLConfig = (FACLConfig) obj;
            if (this.b == fACLConfig.b && TextUtils.equals(this.c, fACLConfig.c) && this.d == fACLConfig.d && this.e == fACLConfig.e && this.f == fACLConfig.f && this.g == fACLConfig.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.e(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.c(parcel, a);
    }

    public FACLConfig(boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = 1;
        this.b = z;
        if (z) {
            this.c = "";
        } else {
            this.c = str;
        }
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }
}
