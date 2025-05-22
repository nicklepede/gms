package com.google.android.gms.autofill.service.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.fill.FillForm;
import defpackage.ahwr;
import defpackage.ahws;
import defpackage.ekvi;
import defpackage.elgo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public abstract class AbstractDetectionHistory$DetectionResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ahwr();
    public static final Parcelable.Creator a = new ahws();

    public static AbstractDetectionHistory$DetectionResult a(FillForm fillForm, Iterable iterable) {
        return new AutoValue_AbstractDetectionHistory_DetectionResult(ekvi.i(fillForm), elgo.h(iterable));
    }

    public abstract ekvi b();

    public abstract elgo c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekvi b = b();
        parcel.writeInt(b.h() ? 1 : 0);
        if (b.h()) {
            parcel.writeTypedObject((FillForm) b.c(), i);
        }
        parcel.writeTypedList(c());
    }
}
