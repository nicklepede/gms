package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amti;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CreateAudioPolicyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amti();
    public final AudioPolicyMixData[] a;

    public CreateAudioPolicyRequest(AudioPolicyMixData[] audioPolicyMixDataArr) {
        this.a = audioPolicyMixDataArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AudioPolicyMixData[] audioPolicyMixDataArr = this.a;
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, audioPolicyMixDataArr, i);
        atzr.c(parcel, a);
    }
}
