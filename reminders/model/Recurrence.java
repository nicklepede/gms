package com.google.android.gms.reminders.model;

import android.os.Parcelable;
import defpackage.atqs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public interface Recurrence extends Parcelable, atqs {
    DailyPattern a();

    MonthlyPattern c();

    RecurrenceEnd d();

    RecurrenceStart e();

    WeeklyPattern f();

    YearlyPattern g();

    Integer h();

    Integer i();
}
