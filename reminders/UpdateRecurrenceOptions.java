package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.czmz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class UpdateRecurrenceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czmz();
    public final int a;
    public final boolean b;
    public final Long c;

    static {
        new UpdateRecurrenceOptions(null, null, null);
    }

    public UpdateRecurrenceOptions(Integer num, Boolean bool, Long l) {
        boolean z = true;
        if (num != null && num.intValue() != 0 && num.intValue() != 1) {
            z = false;
        }
        atzb.c(z, "Invalid update mode");
        this.a = num == null ? 0 : num.intValue();
        this.b = bool != null ? bool.booleanValue() : false;
        this.c = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.e(parcel, 3, this.b);
        atzr.I(parcel, 4, this.c);
        atzr.c(parcel, a);
    }
}
