package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.MonthlyPatternEntity;
import defpackage.cznx;
import defpackage.czoj;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class MonthlyPatternRef extends cznx implements MonthlyPattern {
    public MonthlyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    public static boolean e(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.f(G(str, "monthly_pattern_month_day"), i, i2) && dataHolder.f(G(str, "monthly_pattern_week_day"), i, i2) && dataHolder.f(G(str, "monthly_pattern_week_day_number"), i, i2);
    }

    @Override // com.google.android.gms.reminders.model.MonthlyPattern
    public final Integer a() {
        return n(p("monthly_pattern_week_day"));
    }

    @Override // com.google.android.gms.reminders.model.MonthlyPattern
    public final Integer c() {
        return n(p("monthly_pattern_week_day_number"));
    }

    @Override // com.google.android.gms.reminders.model.MonthlyPattern
    public final List d() {
        return H(p("monthly_pattern_month_day"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof MonthlyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MonthlyPatternEntity.e(this, (MonthlyPattern) obj);
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return MonthlyPatternEntity.b(this);
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new MonthlyPatternEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czoj.a(new MonthlyPatternEntity(this), parcel);
    }
}
