package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctcz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ManagedSecureElementWalletIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctcz();
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public String h;
    public boolean i;
    public boolean j;

    private ManagedSecureElementWalletIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ManagedSecureElementWalletIntentArgs) {
            ManagedSecureElementWalletIntentArgs managedSecureElementWalletIntentArgs = (ManagedSecureElementWalletIntentArgs) obj;
            if (arwb.b(Long.valueOf(this.a), Long.valueOf(managedSecureElementWalletIntentArgs.a)) && arwb.b(this.b, managedSecureElementWalletIntentArgs.b) && arwb.b(this.c, managedSecureElementWalletIntentArgs.c) && arwb.b(this.d, managedSecureElementWalletIntentArgs.d) && arwb.b(this.e, managedSecureElementWalletIntentArgs.e) && arwb.b(Boolean.valueOf(this.f), Boolean.valueOf(managedSecureElementWalletIntentArgs.f)) && arwb.b(Boolean.valueOf(this.g), Boolean.valueOf(managedSecureElementWalletIntentArgs.g)) && arwb.b(this.h, managedSecureElementWalletIntentArgs.h) && arwb.b(Boolean.valueOf(this.i), Boolean.valueOf(managedSecureElementWalletIntentArgs.i)) && arwb.b(Boolean.valueOf(this.j), Boolean.valueOf(managedSecureElementWalletIntentArgs.j))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.e(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.v(parcel, 8, this.h, false);
        arxc.e(parcel, 9, this.i);
        arxc.e(parcel, 10, this.j);
        arxc.c(parcel, a);
    }

    public ManagedSecureElementWalletIntentArgs(long j, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, boolean z3, boolean z4) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = str5;
        this.i = z3;
        this.j = z4;
    }
}
