package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atqs;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjua;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ScreenshotEntity extends GamesAbstractSafeParcelable implements Parcelable, atqs {
    public static final Parcelable.Creator CREATOR = new bjua();
    public final Uri a;
    public final int b;
    public final int c;

    public ScreenshotEntity(Uri uri, int i, int i2) {
        this.a = uri;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScreenshotEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ScreenshotEntity screenshotEntity = (ScreenshotEntity) obj;
        return atyq.b(screenshotEntity.a, this.a) && atyq.b(Integer.valueOf(screenshotEntity.b), Integer.valueOf(this.b)) && atyq.b(Integer.valueOf(screenshotEntity.c), Integer.valueOf(this.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("Uri", this.a, arrayList);
        atyp.b("Width", Integer.valueOf(this.b), arrayList);
        atyp.b("Height", Integer.valueOf(this.c), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, uri, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
