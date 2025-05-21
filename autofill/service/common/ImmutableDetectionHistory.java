package com.google.android.gms.autofill.service.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afwe;
import defpackage.afwi;
import defpackage.asej;
import defpackage.asot;
import defpackage.eitj;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ImmutableDetectionHistory extends afwe implements Parcelable {
    private final eitj c;
    public static final asot b = asot.b("ImmutableDetectionHistory", asej.AUTOFILL);
    public static final Parcelable.Creator CREATOR = new afwi();

    public ImmutableDetectionHistory(List list) {
        this.c = eitj.i(list);
    }

    public static final ImmutableDetectionHistory k(afwe afweVar) {
        return new ImmutableDetectionHistory(eitj.i(((DetectionHistory) afweVar).h()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.afwe
    public final /* synthetic */ List h() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.c);
    }
}
