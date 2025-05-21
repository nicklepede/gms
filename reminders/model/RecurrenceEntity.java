package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cxep;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RecurrenceEntity extends AbstractSafeParcelable implements Recurrence {
    public static final Parcelable.Creator CREATOR = new cxep();
    public final Integer a;
    public final Integer b;
    public final RecurrenceStartEntity c;
    public final RecurrenceEndEntity d;
    public final DailyPatternEntity e;
    public final WeeklyPatternEntity f;
    public final MonthlyPatternEntity g;
    public final YearlyPatternEntity h;

    public RecurrenceEntity(Integer num, Integer num2, RecurrenceStartEntity recurrenceStartEntity, RecurrenceEndEntity recurrenceEndEntity, DailyPatternEntity dailyPatternEntity, WeeklyPatternEntity weeklyPatternEntity, MonthlyPatternEntity monthlyPatternEntity, YearlyPatternEntity yearlyPatternEntity) {
        this.a = num;
        this.b = num2;
        this.c = recurrenceStartEntity;
        this.d = recurrenceEndEntity;
        this.e = dailyPatternEntity;
        this.f = weeklyPatternEntity;
        this.g = monthlyPatternEntity;
        this.h = yearlyPatternEntity;
    }

    public static int b(Recurrence recurrence) {
        return Arrays.hashCode(new Object[]{recurrence.i(), recurrence.h(), recurrence.e(), recurrence.d(), recurrence.a(), recurrence.f(), recurrence.c(), recurrence.g()});
    }

    public static boolean j(Recurrence recurrence, Recurrence recurrence2) {
        return arwb.b(recurrence.i(), recurrence2.i()) && arwb.b(recurrence.h(), recurrence2.h()) && arwb.b(recurrence.e(), recurrence2.e()) && arwb.b(recurrence.d(), recurrence2.d()) && arwb.b(recurrence.a(), recurrence2.a()) && arwb.b(recurrence.f(), recurrence2.f()) && arwb.b(recurrence.c(), recurrence2.c()) && arwb.b(recurrence.g(), recurrence2.g());
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final DailyPattern a() {
        return this.e;
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final MonthlyPattern c() {
        return this.g;
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final RecurrenceEnd d() {
        return this.d;
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final RecurrenceStart e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Recurrence)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j(this, (Recurrence) obj);
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final WeeklyPattern f() {
        return this.f;
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final YearlyPattern g() {
        return this.h;
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final Integer h() {
        return this.b;
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // com.google.android.gms.reminders.model.Recurrence
    public final Integer i() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxep.a(this, parcel, i);
    }

    public RecurrenceEntity(Recurrence recurrence) {
        this(recurrence.i(), recurrence.h(), recurrence.e(), recurrence.d(), recurrence.a(), recurrence.f(), recurrence.c(), recurrence.g(), false);
    }

    public RecurrenceEntity(Integer num, Integer num2, RecurrenceStart recurrenceStart, RecurrenceEnd recurrenceEnd, DailyPattern dailyPattern, WeeklyPattern weeklyPattern, MonthlyPattern monthlyPattern, YearlyPattern yearlyPattern, boolean z) {
        this.a = num;
        this.b = num2;
        if (z) {
            this.c = (RecurrenceStartEntity) recurrenceStart;
            this.d = (RecurrenceEndEntity) recurrenceEnd;
            this.e = (DailyPatternEntity) dailyPattern;
            this.f = (WeeklyPatternEntity) weeklyPattern;
            this.g = (MonthlyPatternEntity) monthlyPattern;
            this.h = (YearlyPatternEntity) yearlyPattern;
            return;
        }
        this.c = recurrenceStart == null ? null : new RecurrenceStartEntity(recurrenceStart);
        this.d = recurrenceEnd == null ? null : new RecurrenceEndEntity(recurrenceEnd);
        this.e = dailyPattern == null ? null : new DailyPatternEntity(dailyPattern);
        this.f = weeklyPattern == null ? null : new WeeklyPatternEntity(weeklyPattern);
        this.g = monthlyPattern == null ? null : new MonthlyPatternEntity(monthlyPattern);
        this.h = yearlyPattern != null ? new YearlyPatternEntity(yearlyPattern) : null;
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
