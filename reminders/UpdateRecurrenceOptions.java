package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cxdd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class UpdateRecurrenceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxdd();
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
        arwm.c(z, "Invalid update mode");
        this.a = num == null ? 0 : num.intValue();
        this.b = bool != null ? bool.booleanValue() : false;
        this.c = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.e(parcel, 3, this.b);
        arxc.I(parcel, 4, this.c);
        arxc.c(parcel, a);
    }
}
