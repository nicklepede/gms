package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvns;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TicketOption extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvns();
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
            if (atyq.b(this.a, ticketOption.a) && atyq.b(this.b, ticketOption.b) && atyq.b(this.c, ticketOption.c) && atyq.b(this.d, ticketOption.d) && atyq.b(this.e, ticketOption.e)) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }

    public TicketOption(AccessibleImage accessibleImage, String str, String str2, AccessibleImage accessibleImage2, PendingIntent pendingIntent) {
        this.a = accessibleImage;
        this.b = str;
        this.c = str2;
        this.d = accessibleImage2;
        this.e = pendingIntent;
    }
}
