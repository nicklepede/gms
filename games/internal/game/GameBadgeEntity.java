package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjty;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements GameBadge {
    public static final Parcelable.Creator CREATOR = new bjty();
    public final int a;
    public final String b;
    public final String c;
    public final Uri d;

    public GameBadgeEntity(int i, String str, String str2, Uri uri) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = uri;
    }

    @Override // com.google.android.gms.games.internal.game.GameBadge
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.gms.games.internal.game.GameBadge
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GameBadge)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        GameBadge gameBadge = (GameBadge) obj;
        return atyq.b(Integer.valueOf(gameBadge.a()), this.b) && atyq.b(gameBadge.b(), this.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("Type", Integer.valueOf(this.a), arrayList);
        atyp.b("Title", this.b, arrayList);
        atyp.b("Description", this.c, arrayList);
        atyp.b("IconImageUri", this.d, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
