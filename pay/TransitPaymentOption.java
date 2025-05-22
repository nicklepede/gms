package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvob;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TransitPaymentOption extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvob();
    public int a;
    public boolean b;
    public String c;
    public String d;
    public TicketOption e;
    public OpenLoopMetadata f;

    private TransitPaymentOption() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransitPaymentOption) {
            TransitPaymentOption transitPaymentOption = (TransitPaymentOption) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(transitPaymentOption.a)) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(transitPaymentOption.b)) && atyq.b(this.c, transitPaymentOption.c) && atyq.b(this.d, transitPaymentOption.d) && atyq.b(this.e, transitPaymentOption.e) && atyq.b(this.f, transitPaymentOption.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), this.c, this.d, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.c(parcel, a);
    }

    public TransitPaymentOption(int i, boolean z, String str, String str2, TicketOption ticketOption, OpenLoopMetadata openLoopMetadata) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = ticketOption;
        this.f = openLoopMetadata;
    }
}
