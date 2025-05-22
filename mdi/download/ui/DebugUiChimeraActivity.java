package com.google.android.gms.mdi.download.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.gms.R;
import com.google.android.gms.mdi.download.ui.DebugUiChimeraActivity;
import defpackage.atad;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.cetn;
import defpackage.ceto;
import defpackage.dstx;
import defpackage.rxx;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DebugUiChimeraActivity extends rxx {
    public ArrayAdapter j;

    public final void a() {
        atad atadVar = new atad(this, (int[][][]) null);
        atfn atfnVar = new atfn();
        atfnVar.d = 303;
        atfnVar.a = new atfd() { // from class: cepv
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                ceqo ceqoVar = (ceqo) obj;
                ((cepq) ceqoVar.H()).g(new cepm((dhma) obj2), bsxa.a(ceqoVar.r));
            }
        };
        atadVar.jd(atfnVar.a()).z(new cetn(this));
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        int i = dstx.a;
        super.onCreate(bundle);
        setContentView(R.layout.mdd_debug_activity);
        setTitle(R.string.mdd_debug_ui_title);
        ((Button) findViewById(R.id.refresh_file_group_list)).setOnClickListener(new View.OnClickListener() { // from class: cetd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugUiChimeraActivity debugUiChimeraActivity = DebugUiChimeraActivity.this;
                atad atadVar = new atad(debugUiChimeraActivity, (int[][][]) null);
                atadVar.ag().z(new ceti(debugUiChimeraActivity, atadVar));
            }
        });
        ((Button) findViewById(R.id.delete_all_downloaded_files)).setOnClickListener(new View.OnClickListener() { // from class: cete
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugUiChimeraActivity debugUiChimeraActivity = DebugUiChimeraActivity.this;
                atad atadVar = new atad(debugUiChimeraActivity, (int[][][]) null);
                atadVar.ah().z(new cetk(debugUiChimeraActivity, atadVar));
            }
        });
        ((Button) findViewById(R.id.trigger_download)).setOnClickListener(new View.OnClickListener() { // from class: cetf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugUiChimeraActivity debugUiChimeraActivity = DebugUiChimeraActivity.this;
                atad atadVar = new atad(debugUiChimeraActivity, (int[][][]) null);
                atadVar.ai(true).z(new cetm(debugUiChimeraActivity, atadVar));
            }
        });
        ListView listView = (ListView) findViewById(R.id.file_group_list);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, new ArrayList());
        this.j = arrayAdapter;
        listView.setAdapter((ListAdapter) arrayAdapter);
        a();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "Trigger Maintenance Task").setOnMenuItemClickListener(new ceto(this));
        return super.onCreateOptionsMenu(menu);
    }
}
