package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjoj;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PlayerRelationshipInfoEntity extends GamesAbstractSafeParcelable implements PlayerRelationshipInfo {
    public static final Parcelable.Creator CREATOR = new bjoj();
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public PlayerRelationshipInfoEntity(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String b() {
        return this.c;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String c() {
        return this.b;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlayerRelationshipInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerRelationshipInfo playerRelationshipInfo = (PlayerRelationshipInfo) obj;
        return playerRelationshipInfo.a() == this.a && atyq.b(playerRelationshipInfo.c(), this.b) && atyq.b(playerRelationshipInfo.b(), this.c) && atyq.b(playerRelationshipInfo.d(), this.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("FriendStatus", Integer.valueOf(this.a), arrayList);
        String str = this.b;
        if (str != null) {
            atyp.b("Nickname", str, arrayList);
        }
        String str2 = this.c;
        if (str2 != null) {
            atyp.b("InvitationNickname", str2, arrayList);
        }
        if (this.d != null) {
            atyp.b("NicknameAbuseReportToken", str2, arrayList);
        }
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public PlayerRelationshipInfoEntity(PlayerRelationshipInfo playerRelationshipInfo) {
        PlayerRelationshipInfoEntity playerRelationshipInfoEntity = (PlayerRelationshipInfoEntity) playerRelationshipInfo;
        this.a = playerRelationshipInfoEntity.a;
        this.b = playerRelationshipInfoEntity.b;
        this.c = playerRelationshipInfoEntity.c;
        this.d = playerRelationshipInfoEntity.d;
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
