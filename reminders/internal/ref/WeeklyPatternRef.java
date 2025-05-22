package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.WeeklyPattern;
import com.google.android.gms.reminders.model.WeeklyPatternEntity;
import defpackage.cznx;
import defpackage.czou;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class WeeklyPatternRef extends cznx implements WeeklyPattern {
    public WeeklyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    public static boolean c(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.f(G(str, "weekly_pattern_weekday"), i, i2);
    }

    @Override // com.google.android.gms.reminders.model.WeeklyPattern
    public final List a() {
        return H(p("weekly_pattern_weekday"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof WeeklyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return WeeklyPatternEntity.c(this, (WeeklyPattern) obj);
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return WeeklyPatternEntity.b(this);
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new WeeklyPatternEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czou.a(new WeeklyPatternEntity(this), parcel);
    }
}
