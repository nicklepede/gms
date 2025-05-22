package com.google.android.gms.fonts.prefetch;

import android.content.Context;
import com.google.android.gms.fonts.FontMatchSpec;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.bjfw;
import defpackage.bjfy;
import defpackage.bjgh;
import defpackage.bjgp;
import defpackage.bjgr;
import defpackage.bjgs;
import defpackage.bjha;
import defpackage.bjhc;
import defpackage.bjhe;
import defpackage.bjhs;
import defpackage.bjhu;
import defpackage.bjif;
import defpackage.cauf;
import defpackage.eqgc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public abstract class EmojiDownloaderBase extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        bjhc.c("EmojiFontDownloader", "Begin emoji downloader oneoff task", new Object[0]);
        Context applicationContext = getApplicationContext();
        FontMatchSpec fontMatchSpec = new FontMatchSpec("Noto COLR Emoji Compat");
        d();
        bjif bjifVar = bjif.a;
        bjhs a = new bjhu(bjifVar.l(applicationContext)).a(fontMatchSpec);
        bjha c = bjifVar.c(applicationContext);
        bjfy bjfyVar = a.c;
        if (bjfyVar == null) {
            c.c(9, 23510, "com.google.android.gms.fonts.prefetch");
            return 0;
        }
        bjgr j = bjifVar.j();
        if (j == null) {
            c.c(9, 23502, "com.google.android.gms.fonts.prefetch");
            return 0;
        }
        String c2 = bjgs.c(bjfyVar);
        bjfw bjfwVar = bjfyVar.c;
        if (bjfwVar == null) {
            bjfwVar = bjfw.a;
        }
        eqgc.t(j.a(c2, bjgh.a(bjfwVar), bjgp.UPDATE_REQUEST), new bjhe(j, bjifVar.b(applicationContext), a, c), bjifVar.e());
        return 0;
    }

    protected abstract void d();
}
