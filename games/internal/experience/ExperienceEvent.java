package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import defpackage.atqs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public interface ExperienceEvent extends Parcelable, atqs {
    int a();

    int b();

    long c();

    long d();

    long e();

    Uri f();

    Game g();

    @Deprecated
    String getIconImageUrl();

    String h();

    String i();

    String j();
}
