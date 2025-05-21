package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cxes;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RecurrenceStartEntity extends AbstractSafeParcelable implements RecurrenceStart {
    public static final Parcelable.Creator CREATOR = new cxes();
    public final DateTimeEntity a;

    public RecurrenceStartEntity(DateTimeEntity dateTimeEntity) {
        this.a = dateTimeEntity;
    }

    public static int b(RecurrenceStart recurrenceStart) {
        return Arrays.hashCode(new Object[]{recurrenceStart.a()});
    }

    public static boolean c(RecurrenceStart recurrenceStart, RecurrenceStart recurrenceStart2) {
        return arwb.b(recurrenceStart.a(), recurrenceStart2.a());
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceStart
    public final DateTime a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceStart)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return c(this, (RecurrenceStart) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxes.a(this, parcel, i);
    }

    public RecurrenceStartEntity(RecurrenceStart recurrenceStart) {
        DateTime a = recurrenceStart.a();
        this.a = a == null ? null : new DateTimeEntity(a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
