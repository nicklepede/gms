package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bhjt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PlayerLevelInfo extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bhjt();
    public final long a;
    public final long b;
    public final PlayerLevel c;
    public final PlayerLevel d;

    public PlayerLevelInfo(long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        arwm.l(j != -1);
        arwm.s(playerLevel);
        arwm.s(playerLevel2);
        this.a = j;
        this.b = j2;
        this.c = playerLevel;
        this.d = playerLevel2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return arwb.b(Long.valueOf(this.a), Long.valueOf(playerLevelInfo.a)) && arwb.b(Long.valueOf(this.b), Long.valueOf(playerLevelInfo.b)) && arwb.b(this.c, playerLevelInfo.c) && arwb.b(this.d, playerLevelInfo.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.q(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }
}
