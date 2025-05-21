package com.google.android.gms.vision.text.internal.client;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dicz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class RecognitionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dicz();
    public final Rect a;

    public RecognitionOptions(Rect rect) {
        this.a = rect;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.c(parcel, a);
    }

    public RecognitionOptions() {
        this.a = new Rect();
    }
}
