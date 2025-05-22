package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjue;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ProfilelessRecallSummary extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bjue();
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
        return atyq.b(this.a, ((ProfilelessRecallSummary) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.c(parcel, a);
    }
}
