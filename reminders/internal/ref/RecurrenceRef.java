package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DailyPattern;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.RecurrenceStart;
import com.google.android.gms.reminders.model.WeeklyPattern;
import com.google.android.gms.reminders.model.YearlyPattern;
import defpackage.cxeb;
import defpackage.cxep;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RecurrenceRef extends cxeb implements Recurrence {
    private boolean f;
    private RecurrenceStartRef g;
    private boolean h;
    private RecurrenceEndRef i;
    private boolean j;
    private DailyPatternRef k;
    private boolean l;
    private WeeklyPatternRef m;
    private boolean n;
    private MonthlyPatternRef o;
    private boolean p;
    private YearlyPatternRef q;

    public RecurrenceRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
        this.f = false;
        this.h = false;
        this.j = false;
        this.l = false;
        this.n = false;
        this.p = false;
    }

    public static boolean j(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.f(G(str, "recurrence_frequency"), i, i2) && dataHolder.f(G(str, "recurrence_every"), i, i2) && RecurrenceStartRef.c(dataHolder, i, i2, str) && RecurrenceEndRef.f(dataHolder, i, i2, str) && DailyPatternRef.e(dataHolder, i, i2, str) && WeeklyPatternRef.c(dataHolder, i, i2, str) && MonthlyPatternRef.e(dataHolder, i, i2, str) && YearlyPatternRef.d(dataHolder, i, i2, str);
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final DailyPattern a() {
        if (!this.j) {
            this.j = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (DailyPatternRef.e(dataHolder, i, i2, str)) {
                this.k = null;
            } else {
                this.k = new DailyPatternRef(dataHolder, this.b, str);
            }
        }
        return this.k;
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final MonthlyPattern c() {
        if (!this.n) {
            this.n = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (MonthlyPatternRef.e(dataHolder, i, i2, str)) {
                this.o = null;
            } else {
                this.o = new MonthlyPatternRef(dataHolder, this.b, str);
            }
        }
        return this.o;
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final RecurrenceEnd d() {
        if (!this.h) {
            this.h = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (RecurrenceEndRef.f(dataHolder, i, i2, str)) {
                this.i = null;
            } else {
                this.i = new RecurrenceEndRef(dataHolder, this.b, str);
            }
        }
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final RecurrenceStart e() {
        if (!this.f) {
            this.f = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (RecurrenceStartRef.c(dataHolder, i, i2, str)) {
                this.g = null;
            } else {
                this.g = new RecurrenceStartRef(dataHolder, this.b, str);
            }
        }
        return this.g;
    }

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof Recurrence)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return RecurrenceEntity.j(this, (Recurrence) obj);
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final WeeklyPattern f() {
        if (!this.l) {
            this.l = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (WeeklyPatternRef.c(dataHolder, i, i2, str)) {
                this.m = null;
            } else {
                this.m = new WeeklyPatternRef(dataHolder, this.b, str);
            }
        }
        return this.m;
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final YearlyPattern g() {
        if (!this.p) {
            this.p = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (YearlyPatternRef.d(dataHolder, i, i2, str)) {
                this.q = null;
            } else {
                this.q = new YearlyPatternRef(dataHolder, this.b, str);
            }
        }
        return this.q;
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final Integer h() {
        return n(p("recurrence_every"));
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return RecurrenceEntity.b(this);
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final Integer i() {
        return n(p("recurrence_frequency"));
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new RecurrenceEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxep.a(new RecurrenceEntity(this), parcel, i);
    }
}
