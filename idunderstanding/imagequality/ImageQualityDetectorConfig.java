package com.google.android.gms.idunderstanding.imagequality;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bnyd;
import defpackage.fvbo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ImageQualityDetectorConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bnyd();
    public final int a;

    public ImageQualityDetectorConfig(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ImageQualityDetectorConfig) && this.a == ((ImageQualityDetectorConfig) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.c(parcel, a);
    }

    public ImageQualityDetectorConfig() {
        this(1);
    }
}
