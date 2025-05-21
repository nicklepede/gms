package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhpq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class StockProfileImageEntity extends GamesAbstractSafeParcelable implements StockProfileImage {
    public static final Parcelable.Creator CREATOR = new bhpq();
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
        return arwb.b(this.a, stockProfileImage.c()) && arwb.b(this.b, stockProfileImage.a()) && arwb.b(this.c, stockProfileImage.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("ImageId", this.a, arrayList);
        arwa.b("ImageUri", this.b, arrayList);
        arwa.b("A11yLabel", this.c, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
