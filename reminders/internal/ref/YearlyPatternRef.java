package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.YearlyPattern;
import com.google.android.gms.reminders.model.YearlyPatternEntity;
import defpackage.cznx;
import defpackage.czov;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class YearlyPatternRef extends cznx implements YearlyPattern {
    private boolean f;
    private MonthlyPatternRef g;

    public YearlyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
        this.f = false;
    }

    public static boolean d(DataHolder dataHolder, int i, int i2, String str) {
        return MonthlyPatternRef.e(dataHolder, i, i2, str.concat("yearly_pattern_")) && dataHolder.f(G(str, "yearly_pattern_year_month"), i, i2);
    }

    @Override // com.google.android.gms.reminders.model.YearlyPattern
    public final MonthlyPattern a() {
        if (!this.f) {
            this.f = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (MonthlyPatternRef.e(dataHolder, i, i2, str.concat("yearly_pattern_"))) {
                this.g = null;
            } else {
                this.g = new MonthlyPatternRef(dataHolder, this.b, str.concat("yearly_pattern_"));
            }
        }
        return this.g;
    }

    @Override // com.google.android.gms.reminders.model.YearlyPattern
    public final List c() {
        return H(p("yearly_pattern_year_month"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof YearlyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return YearlyPatternEntity.d(this, (YearlyPattern) obj);
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return YearlyPatternEntity.b(this);
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new YearlyPatternEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czov.a(new YearlyPatternEntity(this), parcel, i);
    }
}
