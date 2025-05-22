package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvme;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ManagedSecureElementWalletIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvme();
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
            if (atyq.b(Long.valueOf(this.a), Long.valueOf(managedSecureElementWalletIntentArgs.a)) && atyq.b(this.b, managedSecureElementWalletIntentArgs.b) && atyq.b(this.c, managedSecureElementWalletIntentArgs.c) && atyq.b(this.d, managedSecureElementWalletIntentArgs.d) && atyq.b(this.e, managedSecureElementWalletIntentArgs.e) && atyq.b(Boolean.valueOf(this.f), Boolean.valueOf(managedSecureElementWalletIntentArgs.f)) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(managedSecureElementWalletIntentArgs.g)) && atyq.b(this.h, managedSecureElementWalletIntentArgs.h) && atyq.b(Boolean.valueOf(this.i), Boolean.valueOf(managedSecureElementWalletIntentArgs.i)) && atyq.b(Boolean.valueOf(this.j), Boolean.valueOf(managedSecureElementWalletIntentArgs.j))) {
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.e(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.v(parcel, 8, this.h, false);
        atzr.e(parcel, 9, this.i);
        atzr.e(parcel, 10, this.j);
        atzr.c(parcel, a);
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
