package com.google.android.gms.autofill.service.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ahwt;
import defpackage.ahwx;
import defpackage.auid;
import defpackage.ausn;
import defpackage.elgo;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ImmutableDetectionHistory extends ahwt implements Parcelable {
    private final elgo c;
    public static final ausn b = ausn.b("ImmutableDetectionHistory", auid.AUTOFILL);
    public static final Parcelable.Creator CREATOR = new ahwx();

    public ImmutableDetectionHistory(List list) {
        this.c = elgo.i(list);
    }

    public static final ImmutableDetectionHistory k(ahwt ahwtVar) {
        return new ImmutableDetectionHistory(elgo.i(((DetectionHistory) ahwtVar).h()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ahwt
    public final /* synthetic */ List h() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.c);
    }
}
