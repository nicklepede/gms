package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhpp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ProfilelessRecallSummary extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bhpp();
    public final String a;

    public ProfilelessRecallSummary(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ProfilelessRecallSummary)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return arwb.b(this.a, ((ProfilelessRecallSummary) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.c(parcel, a);
    }
}
