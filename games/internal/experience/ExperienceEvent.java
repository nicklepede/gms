package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import defpackage.arod;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public interface ExperienceEvent extends Parcelable, arod {
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
