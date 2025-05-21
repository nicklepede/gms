package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cxeq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RecurrenceEndEntity extends AbstractSafeParcelable implements RecurrenceEnd {
    public static final Parcelable.Creator CREATOR = new cxeq();
    public final DateTimeEntity a;
    public final Integer b;
    public final Boolean c;
    public final DateTimeEntity d;

    public RecurrenceEndEntity(DateTimeEntity dateTimeEntity, Integer num, Boolean bool, DateTimeEntity dateTimeEntity2) {
        this.a = dateTimeEntity;
        this.b = num;
        this.c = bool;
        this.d = dateTimeEntity2;
    }

    public static int b(RecurrenceEnd recurrenceEnd) {
        return Arrays.hashCode(new Object[]{recurrenceEnd.c(), recurrenceEnd.e(), recurrenceEnd.d(), recurrenceEnd.a()});
    }

    public static boolean f(RecurrenceEnd recurrenceEnd, RecurrenceEnd recurrenceEnd2) {
        return arwb.b(recurrenceEnd.c(), recurrenceEnd2.c()) && arwb.b(recurrenceEnd.e(), recurrenceEnd2.e()) && arwb.b(recurrenceEnd.d(), recurrenceEnd2.d()) && arwb.b(recurrenceEnd.a(), recurrenceEnd2.a());
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceEnd
    public final DateTime a() {
        return this.d;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceEnd
    public final DateTime c() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceEnd
    public final Boolean d() {
        return this.c;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceEnd
    public final Integer e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceEnd)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return f(this, (RecurrenceEnd) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxeq.a(this, parcel, i);
    }

    public RecurrenceEndEntity(DateTime dateTime, Integer num, Boolean bool, DateTime dateTime2, boolean z) {
        this.b = num;
        this.c = bool;
        if (z) {
            this.a = (DateTimeEntity) dateTime;
            this.d = (DateTimeEntity) dateTime2;
        } else {
            this.a = dateTime == null ? null : new DateTimeEntity(dateTime);
            this.d = dateTime2 != null ? new DateTimeEntity(dateTime2) : null;
        }
    }

    public RecurrenceEndEntity(RecurrenceEnd recurrenceEnd) {
        this(recurrenceEnd.c(), recurrenceEnd.e(), recurrenceEnd.d(), recurrenceEnd.a(), false);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
