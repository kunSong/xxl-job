package org.song.xxl.job.executor.service.handler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

@Component
public class MyJobHandler {

    @XxlJob("myJobHandle")
    public void myJobHandle() {
        XxlJobHelper.log("songkun job handle");
    }
}
