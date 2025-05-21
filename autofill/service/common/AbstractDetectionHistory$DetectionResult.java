package com.google.android.gms.autofill.service.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.fill.FillForm;
import defpackage.afwc;
import defpackage.afwd;
import defpackage.eiid;
import defpackage.eitj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class AbstractDetectionHistory$DetectionResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new afwc();
    public static final Parcelable.Creator a = new afwd();

    public static AbstractDetectionHistory$DetectionResult a(FillForm fillForm, Iterable iterable) {
        return new AutoValue_AbstractDetectionHistory_DetectionResult(eiid.i(fillForm), eitj.h(iterable));
    }

    public abstract eiid b();

    public abstract eitj c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        eiid b = b();
        parcel.writeInt(b.h() ? 1 : 0);
        if (b.h()) {
            parcel.writeTypedObject((FillForm) b.c(), i);
        }
        parcel.writeTypedList(c());
    }
}
