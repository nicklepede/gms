package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctew;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TransitPaymentOption extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctew();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(transitPaymentOption.a)) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(transitPaymentOption.b)) && arwb.b(this.c, transitPaymentOption.c) && arwb.b(this.d, transitPaymentOption.d) && arwb.b(this.e, transitPaymentOption.e) && arwb.b(this.f, transitPaymentOption.f)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
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
