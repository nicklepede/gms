package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cten;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TicketOption extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cten();
    public AccessibleImage a;
    public String b;
    public String c;
    public AccessibleImage d;
    public PendingIntent e;

    private TicketOption() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TicketOption) {
            TicketOption ticketOption = (TicketOption) obj;
            if (arwb.b(this.a, ticketOption.a) && arwb.b(this.b, ticketOption.b) && arwb.b(this.c, ticketOption.c) && arwb.b(this.d, ticketOption.d) && arwb.b(this.e, ticketOption.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }

    public TicketOption(AccessibleImage accessibleImage, String str, String str2, AccessibleImage accessibleImage2, PendingIntent pendingIntent) {
        this.a = accessibleImage;
        this.b = str;
        this.c = str2;
        this.d = accessibleImage2;
        this.e = pendingIntent;
    }
}
