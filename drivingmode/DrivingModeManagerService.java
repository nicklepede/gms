package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.axps;
import defpackage.axql;
import defpackage.axqs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DrivingModeManagerService extends BoundService {
    private axps a;

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        axps axpsVar = new axps(getApplicationContext());
        this.a = axpsVar;
        if (!axpsVar.b) {
            axpsVar.b = true;
            axpsVar.a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(axpsVar);
        }
        axql axqlVar = new axql(getApplicationContext());
        return axqlVar.getInterfaceDescriptor() == null ? axqlVar : new axqs(axqlVar);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        axps axpsVar = this.a;
        if (axpsVar.b) {
            axpsVar.b = false;
            Thread.setDefaultUncaughtExceptionHandler(axpsVar.a);
        }
        return false;
    }
}
