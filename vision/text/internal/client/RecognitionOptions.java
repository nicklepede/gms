package com.google.android.gms.vision.text.internal.client;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkok;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class RecognitionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkok();
    public final Rect a;

    public RecognitionOptions(Rect rect) {
        this.a = rect;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.c(parcel, a);
    }

    public RecognitionOptions() {
        this.a = new Rect();
    }
}
