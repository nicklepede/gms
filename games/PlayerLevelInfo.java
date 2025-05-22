package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bjoi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PlayerLevelInfo extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bjoi();
    public final long a;
    public final long b;
    public final PlayerLevel c;
    public final PlayerLevel d;

    public PlayerLevelInfo(long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        atzb.l(j != -1);
        atzb.s(playerLevel);
        atzb.s(playerLevel2);
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
        return atyq.b(Long.valueOf(this.a), Long.valueOf(playerLevelInfo.a)) && atyq.b(Long.valueOf(this.b), Long.valueOf(playerLevelInfo.b)) && atyq.b(this.c, playerLevelInfo.c) && atyq.b(this.d, playerLevelInfo.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.q(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }
}
