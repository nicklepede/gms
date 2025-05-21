package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.provider.Settings;
import defpackage.anxp;
import defpackage.apsr;
import defpackage.apsz;
import defpackage.apta;
import defpackage.dibc;
import defpackage.dibx;
import defpackage.dnly;
import defpackage.dnmt;
import defpackage.dvms;
import defpackage.dvni;
import defpackage.evah;
import defpackage.fsth;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class VisionClearcutLogger {
    static final int LAST_EVENT_CODE = 3;
    private static final String LOG_SOURCE = "VISION";
    private static final String USAGE_AND_DIAGNOSTICS_CHECKBOX_NAME = "multi_cb";
    private final dnly basis;
    private final Context context;
    boolean isUserOptedIn;
    private boolean logToClearcut;
    private final apta logger;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VisionClearcutLogger(Context context) {
        this(context, new apsr(context, LOG_SOURCE).a());
        List list = apta.n;
    }

    public void log(int i, evah evahVar) {
        if (i < 0 || i > 3) {
            dibc.c("Illegal event code: %d", Integer.valueOf(i));
            return;
        }
        try {
            if (!this.logToClearcut || !this.isUserOptedIn) {
                dibc.d("Would have logged:\n%s", evahVar);
                return;
            }
            if (fsth.a.a().a()) {
                apsz j = this.logger.j(evahVar, dnmt.b(anxp.a, this.basis));
                j.l(i);
                j.d();
            } else {
                apsz j2 = this.logger.j(evahVar, dnmt.b(this.context, this.basis));
                j2.l(i);
                j2.d();
            }
        } catch (Exception e) {
            e.printStackTrace();
            dibc.b(e, "Failed to log", new Object[0]);
        }
    }

    public void setLogToClearcut(boolean z) {
        this.logToClearcut = z;
    }

    public VisionClearcutLogger(Context context, apta aptaVar) {
        this.basis = new dibx();
        boolean z = true;
        this.logToClearcut = true;
        this.isUserOptedIn = false;
        this.context = context;
        this.logger = aptaVar;
        dvni.f(context);
        dvms.e(context);
        try {
            if (Settings.Global.getInt(context.getContentResolver(), USAGE_AND_DIAGNOSTICS_CHECKBOX_NAME) != 1) {
                z = false;
            }
            this.isUserOptedIn = z;
        } catch (Settings.SettingNotFoundException e) {
            dibc.b(e, "Couldn't read checkbot setting", new Object[0]);
        }
    }
}
