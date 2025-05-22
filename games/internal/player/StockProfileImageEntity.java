package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjuf;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class StockProfileImageEntity extends GamesAbstractSafeParcelable implements StockProfileImage {
    public static final Parcelable.Creator CREATOR = new bjuf();
    public final String a;
    public final Uri b;
    public final String c;

    public StockProfileImageEntity(String str, Uri uri, String str2) {
        this.a = str;
        this.b = uri;
        this.c = str2;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public final Uri a() {
        return this.b;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public final String b() {
        return this.c;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StockProfileImage stockProfileImage = (StockProfileImage) obj;
        return atyq.b(this.a, stockProfileImage.c()) && atyq.b(this.b, stockProfileImage.a()) && atyq.b(this.c, stockProfileImage.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("ImageId", this.a, arrayList);
        atyp.b("ImageUri", this.b, arrayList);
        atyp.b("A11yLabel", this.c, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
