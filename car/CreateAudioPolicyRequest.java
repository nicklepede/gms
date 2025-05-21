package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.akrx;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CreateAudioPolicyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akrx();
    public final AudioPolicyMixData[] a;

    public CreateAudioPolicyRequest(AudioPolicyMixData[] audioPolicyMixDataArr) {
        this.a = audioPolicyMixDataArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AudioPolicyMixData[] audioPolicyMixDataArr = this.a;
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, audioPolicyMixDataArr, i);
        arxc.c(parcel, a);
    }
}
