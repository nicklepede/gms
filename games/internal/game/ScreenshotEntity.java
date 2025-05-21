package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arod;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhpl;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ScreenshotEntity extends GamesAbstractSafeParcelable implements Parcelable, arod {
    public static final Parcelable.Creator CREATOR = new bhpl();
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
        return arwb.b(screenshotEntity.a, this.a) && arwb.b(Integer.valueOf(screenshotEntity.b), Integer.valueOf(this.b)) && arwb.b(Integer.valueOf(screenshotEntity.c), Integer.valueOf(this.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("Uri", this.a, arrayList);
        arwa.b("Width", Integer.valueOf(this.b), arrayList);
        arwa.b("Height", Integer.valueOf(this.c), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, uri, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
