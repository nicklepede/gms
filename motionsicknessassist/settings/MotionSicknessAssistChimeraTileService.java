package com.google.android.gms.motionsicknessassist.settings;

import android.content.Context;
import android.service.quicksettings.Tile;
import com.google.android.chimera.TileService;
import com.google.android.gms.chimera.modules.motionsicknessassist.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.motionsicknessassist.settings.MotionSicknessAssistChimeraTileService;
import defpackage.asot;
import defpackage.cetu;
import defpackage.ceud;
import defpackage.ceue;
import defpackage.ceuv;
import defpackage.cevj;
import defpackage.ejhf;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MotionSicknessAssistChimeraTileService extends TileService {
    public static final asot a = cetu.a("QT");
    public ceuv b;
    public Context c;
    private Executor d;
    private TracingBroadcastReceiver e;

    public final void a() {
        Tile qsTile = getQsTile();
        if (qsTile == null) {
            ((ejhf) ((ejhf) a.j()).ah((char) 6472)).x("tile is not available.");
        } else {
            ensj.t(ensi.h(this.b.h()), new ceue(this, qsTile), this.d);
        }
    }

    @Override // com.google.android.chimera.TileService
    public final void onClick() {
        ((ejhf) ((ejhf) a.h()).ah((char) 6464)).x("onClick");
        ensj.t(ensi.h(this.b.h()), new ceud(this), this.d);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        ((ejhf) ((ejhf) a.h()).ah((char) 6465)).x(" onCreate");
        this.c = AppContextProvider.a();
        cevj cevjVar = new cevj(this.c);
        this.b = cevjVar;
        this.e = cevjVar.b(new Runnable() { // from class: ceuc
            @Override // java.lang.Runnable
            public final void run() {
                MotionSicknessAssistChimeraTileService.this.a();
            }
        });
        this.d = enre.a;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        ((ejhf) ((ejhf) a.h()).ah((char) 6466)).x("onDestroy, unregistering broadcast listener");
        this.b.o(this.e);
    }

    @Override // com.google.android.chimera.TileService
    public final void onStartListening() {
        ((ejhf) ((ejhf) a.h()).ah((char) 6467)).x("onStartListening");
        a();
    }

    @Override // com.google.android.chimera.TileService
    public final void onStopListening() {
        ((ejhf) ((ejhf) a.h()).ah((char) 6468)).x("onStopListening");
    }

    @Override // com.google.android.chimera.TileService
    public final void onTileAdded() {
        ((ejhf) ((ejhf) a.h()).ah((char) 6469)).x("onTileAdded");
        a();
    }

    @Override // com.google.android.chimera.TileService
    public final void onTileRemoved() {
        ((ejhf) ((ejhf) a.h()).ah((char) 6470)).x("onTileRemoved");
    }
}
