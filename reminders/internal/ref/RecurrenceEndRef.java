package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.RecurrenceEndEntity;
import defpackage.cxeb;
import defpackage.cxeq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RecurrenceEndRef extends cxeb implements RecurrenceEnd {
    private boolean f;
    private DateTimeRef g;
    private boolean h;
    private DateTimeRef i;

    public RecurrenceEndRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
        this.f = false;
        this.h = false;
    }

    public static boolean f(DataHolder dataHolder, int i, int i2, String str) {
        return DateTimeRef.k(dataHolder, i, i2, str.concat("recurrence_end_")) && dataHolder.f(G(str, "recurrence_end_num_occurrences"), i, i2) && dataHolder.f(G(str, "recurrence_end_auto_renew"), i, i2) && DateTimeRef.k(dataHolder, i, i2, str.concat("recurrence_end_auto_renew_until_"));
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceEnd
    public final DateTime a() {
        if (!this.h) {
            this.h = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (DateTimeRef.k(dataHolder, i, i2, str.concat("recurrence_end_auto_renew_until_"))) {
                this.i = null;
            } else {
                this.i = new DateTimeRef(dataHolder, this.b, str.concat("recurrence_end_auto_renew_until_"));
            }
        }
        return this.i;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceEnd
    public final DateTime c() {
        if (!this.f) {
            this.f = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (DateTimeRef.k(dataHolder, i, i2, str.concat("recurrence_end_"))) {
                this.g = null;
            } else {
                this.g = new DateTimeRef(dataHolder, this.b, str.concat("recurrence_end_"));
            }
        }
        return this.g;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceEnd
    public final Boolean d() {
        return Boolean.valueOf(t(p("recurrence_end_auto_renew")));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceEnd
    public final Integer e() {
        return n(p("recurrence_end_num_occurrences"));
    }

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceEnd)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return RecurrenceEndEntity.f(this, (RecurrenceEnd) obj);
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return RecurrenceEndEntity.b(this);
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new RecurrenceEndEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxeq.a(new RecurrenceEndEntity(this), parcel, i);
    }
}
