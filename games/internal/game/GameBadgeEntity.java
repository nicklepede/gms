package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhpj;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements GameBadge {
    public static final Parcelable.Creator CREATOR = new bhpj();
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
        return arwb.b(Integer.valueOf(gameBadge.a()), this.b) && arwb.b(gameBadge.b(), this.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("Type", Integer.valueOf(this.a), arrayList);
        arwa.b("Title", this.b, arrayList);
        arwa.b("Description", this.c, arrayList);
        arwa.b("IconImageUri", this.d, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
