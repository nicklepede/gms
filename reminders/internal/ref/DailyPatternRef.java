package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DailyPattern;
import com.google.android.gms.reminders.model.DailyPatternEntity;
import com.google.android.gms.reminders.model.Time;
import defpackage.cxeb;
import defpackage.cxeg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class DailyPatternRef extends cxeb implements DailyPattern {
    private boolean f;
    private TimeRef g;

    public DailyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
        this.f = false;
    }

    public static boolean e(DataHolder dataHolder, int i, int i2, String str) {
        return TimeRef.e(dataHolder, i, i2, str.concat("daily_pattern_")) && dataHolder.f(G(str, "daily_pattern_period"), i, i2) && dataHolder.f(G(str, "daily_pattern_all_day"), i, i2);
    }

    @Override // com.google.android.gms.reminders.model.DailyPattern
    public final Time a() {
        if (!this.f) {
            this.f = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (TimeRef.e(dataHolder, i, i2, str.concat("daily_pattern_"))) {
                this.g = null;
            } else {
                this.g = new TimeRef(dataHolder, this.b, str.concat("daily_pattern_"));
            }
        }
        return this.g;
    }

    @Override // com.google.android.gms.reminders.model.DailyPattern
    public final Boolean c() {
        return Boolean.valueOf(t(p("daily_pattern_all_day")));
    }

    @Override // com.google.android.gms.reminders.model.DailyPattern
    public final Integer d() {
        return n(p("daily_pattern_period"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof DailyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return DailyPatternEntity.e(this, (DailyPattern) obj);
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return DailyPatternEntity.b(this);
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new DailyPatternEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxeg.a(new DailyPatternEntity(this), parcel, i);
    }
}
