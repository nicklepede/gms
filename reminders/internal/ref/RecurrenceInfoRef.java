package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceInfo;
import com.google.android.gms.reminders.model.RecurrenceInfoEntity;
import defpackage.cznx;
import defpackage.czon;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RecurrenceInfoRef extends cznx implements RecurrenceInfo {
    private boolean f;
    private RecurrenceRef g;

    public RecurrenceInfoRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
        this.f = false;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceInfo
    public final Recurrence a() {
        if (!this.f) {
            this.f = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (RecurrenceRef.j(dataHolder, i, i2, str)) {
                this.g = null;
            } else {
                this.g = new RecurrenceRef(dataHolder, this.b, str);
            }
        }
        return this.g;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceInfo
    public final Boolean c() {
        return Boolean.valueOf(t(p("recurrence_exceptional")));
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceInfo
    public final Boolean d() {
        return Boolean.valueOf(t(p("recurrence_master")));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceInfo
    public final String e() {
        return r(p("recurrence_id"));
    }

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return RecurrenceInfoEntity.f(this, (RecurrenceInfo) obj);
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return RecurrenceInfoEntity.b(this);
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new RecurrenceInfoEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czon.a(new RecurrenceInfoEntity(this), parcel, i);
    }
}
